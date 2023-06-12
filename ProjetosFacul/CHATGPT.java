import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CHATGPT {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 60;
    private static final int NUMBERS_PER_GAME = 6;
    private static final int QUADRA_THRESHOLD = 4;
    private static final int QUINA_THRESHOLD = 5;
    private static final int SENA_THRESHOLD = 6;

    private static final Scanner scanner = new Scanner(System.in);

    private static List<List<Integer>> launchedGames = new ArrayList<>();
    private static List<Integer> drawnNumbers = new ArrayList<>();
    private static Map<List<Integer>, Integer> gameResults = new HashMap<>();

    public static void main(String[] args) {
        int option;
        do {
            displayMainMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    launchGames();
                    break;
                case 2:
                    showLaunchedGames();
                    break;
                case 3:
                    performDraw();
                    break;
                case 4:
                    checkResults();
                    break;
                case 5:
                    showWinners();
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (option != 0);
    }

    private static void displayMainMenu() {
        System.out.println("-------- Menu Principal --------");
        System.out.println("1. Lançar jogos");
        System.out.println("2. Mostrar jogos lançados");
        System.out.println("3. Realizar sorteio");
        System.out.println("4. Verificar acertos");
        System.out.println("5. Mostrar ganhadores");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void launchGames() {
        System.out.print("Quantos jogos você deseja lançar? ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < numGames; i++) {
            System.out.println("\nJogo " + (i + 1) + ":");
            List<Integer> game = new ArrayList<>();

            // Opção para lançar jogos de modo aleatório e automático
            System.out.println("Escolha uma opção para lançar os números do jogo:");
            System.out.println("1. Digitar números manualmente");
            System.out.println("2. Gerar números aleatórios");
            System.out.print("Opção: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (option == 1) {
                for (int j = 0; j < NUMBERS_PER_GAME; j++) {
                    System.out.print("Digite o número " + (j + 1) + ": ");
                    int number = scanner.nextInt();
                    if (number < MIN_NUMBER || number > MAX_NUMBER) {
                        System.out.println("Número inválido. Tente novamente.");
                        j--;
                        continue;
                    }
                    if (game.contains(number)) {
                        System.out.println("Número já escolhido. Tente novamente.");
                        j--;
                        continue;
                    }
                    game.add(number);
                }
            } else if (option == 2) {
                Set<Integer> chosenNumbers = new HashSet<>();
                Random random = new Random();
                while (chosenNumbers.size() < NUMBERS_PER_GAME) {
                    int number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
                    chosenNumbers.add(number);
                }
                game.addAll(chosenNumbers);
            }

            Collections.sort(game);
            launchedGames.add(game);
        }

        saveLaunchedGamesToFile();
    }

    private static void saveLaunchedGamesToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Lancados.txt"))) {
            for (List<Integer> game : launchedGames) {
                StringBuilder line = new StringBuilder();
                for (int number : game) {
                    line.append(number).append(" ");
                }
                writer.write(line.toString().trim());
                writer.newLine();
            }
            System.out.println("\nJogos lançados salvos no arquivo Lancados.txt.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os jogos lançados.");
        }
    }

    private static void showLaunchedGames() {
        System.out.println("\nJogos lançados:");
        for (List<Integer> game : launchedGames) {
            for (int number : game) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private static void performDraw() {
        Random random = new Random();
        Set<Integer> chosenNumbers = new HashSet<>();
        while (chosenNumbers.size() < NUMBERS_PER_GAME) {
            int number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            chosenNumbers.add(number);
        }
        drawnNumbers = new ArrayList<>(chosenNumbers);
        Collections.sort(drawnNumbers);

        saveDrawnNumbersToFile();

        System.out.println("\nSorteio realizado com sucesso.");
    }

    private static void saveDrawnNumbersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sorteio.txt"))) {
            for (int number : drawnNumbers) {
                writer.write(String.valueOf(number));
                writer.newLine();
            }
            System.out.println("Números sorteados salvos no arquivo Sorteio.txt.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os números sorteados.");
        }
    }

    private static void checkResults() {
        gameResults.clear();
        for (List<Integer> game : launchedGames) {
            int numMatches = countMatches(game, drawnNumbers);
            gameResults.put(game, numMatches);
        }

        saveResultsToFile();

        System.out.println("\nVerificação de acertos concluída.");
    }

    private static int countMatches(List<Integer> game, List<Integer> drawnNumbers) {
        int count = 0;
        for (int number : game) {
            if (drawnNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private static void saveResultsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Resultado.txt"))) {
            List<Map.Entry<List<Integer>, Integer>> sortedResults = new ArrayList<>(gameResults.entrySet());
            sortedResults.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            for (Map.Entry<List<Integer>, Integer> entry : sortedResults) {
                List<Integer> game = entry.getKey();
                int numMatches = entry.getValue();
                StringBuilder line = new StringBuilder();
                for (int number : game) {
                    line.append(number).append(" ");
                }
                line.append(" - ").append(numMatches).append(" acerto(s)");
                writer.write(line.toString().trim());
                writer.newLine();
            }
            System.out.println("Resultados salvos no arquivo Resultado.txt.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os resultados.");
        }
    }

    private static void showWinners() {
        System.out.println("\n-------- Ganhadores --------");
        for (Map.Entry<List<Integer>, Integer> entry : gameResults.entrySet()) {
            List<Integer> game = entry.getKey();
            int numMatches = entry.getValue();

            String winnerType;
            switch (numMatches) {
                case QUADRA_THRESHOLD:
                    winnerType = "Quadra";
                    break;
                case QUINA_THRESHOLD:
                    winnerType = "Quina";
                    break;
                case SENA_THRESHOLD:
                    winnerType = "Sena";
                    break;
                default:
                    continue;
            }

            System.out.print("Jogo: ");
            for (int number : game) {
                System.out.print(number + " ");
            }
            System.out.println("- " + numMatches + " acerto(s) (" + winnerType + ")");
        }
    }
}
