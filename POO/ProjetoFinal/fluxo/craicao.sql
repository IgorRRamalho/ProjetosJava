/* Lógico_1: */

CREATE TABLE Aluno (
    AlunoID INTEGER not null auto_increment primary key,
    Nome VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    NomePai VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    NomeMae VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    RG CHAR(20),  -- Substitua 20 pelo tamanho máximo desejado
    CPF CHAR(14) unique,  -- Substitua 14 pelo tamanho máximo desejado
    DataNasc DATE,
    Email VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    Sexo CHAR(1),  -- Assume que Sexo é uma única letra, ajuste conforme necessário
    Celular CHAR(15)  
    


);


create table DadosAcademicos(	 
AlunoID INTEGER FOREIGN KEY REFERENCES Aluno(AlunoID)
CursoID INTEGER FOREIGN KEY REFERENCES Curso(CursoID)



)


CREATE TABLE Materias (
    MateriaID INT PRIMARY KEY AUTO_INCREMENT,
    NomeMateria VARCHAR(50) NOT null unique
    
);

CREATE TABLE GradeEscolar (
    AlunoID INT,
    MateriaID INT,
    FOREIGN KEY (AlunoID) REFERENCES Aluno(AlunoID),
    FOREIGN KEY (MateriaID) REFERENCES Materias(MateriaID)
);

create table Historico(
	AlunoID int, 
	Prova1 float,
	Prova2 float,
	faltas int,
	FOREIGN KEY (AlunoID) REFERENCES Aluno(AlunoID),

)


create table Curso(
   	CursoID INTEGER not null auto_increment primary key,
    NomeCurso VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    Turno VARCHAR(50),  -- Substitua 50 pelo tamanho máximo desejado
    DataCriacao DATE,
    NotaMEC INTEGER,
    QuantSemestres INTEGER,
    MinEducacaoID INTEGER,
    AnoAltGrade date,
    TCC bit,
    Creditos INTEGER,
    HorasComplementares INTEGER,
    Semestres INTEGER
    )

CREATE TABLE Endereco (
	AlunoID int,
    Rua VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    Bairro VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    Numero INTEGER,
    Complemento VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    CEP VARCHAR(10),  -- Substitua 10 pelo tamanho máximo desejado
    Cidade VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    Estado VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    FOREIGN KEY (AlunoID) REFERENCES Aluno(AlunoID)
);

create table Origem(
 	AlunoID int, 
	HistoricoEM bit,
    Reservista bit,
    Comp_Residencia bit,
    ColegioAntigo VARCHAR(255),  -- Substitua 255 pelo tamanho máximo desejado
    EJA bit,
    EnsinoTecnico bit,
    FOREIGN KEY (AlunoID) REFERENCES Aluno(AlunoID),

)



 