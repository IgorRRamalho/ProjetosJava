/* Lógico_1: */

CREATE TABLE Aluno_Curso_Documentos_Origem (
    AlunoID INTEGER,
    Nome VARCHAR,
    NomePai VARCHAR,
    NomeMae VARCHAR,
    RG CHAR,
    CPF CHAR,
    DataNasc DATE,
    Email VARCHAR,
    Sexo CHAR,
    Celular CHAR,
    CursoID INTEGER,
    NomeCurso VARCHAR,
    Turno VARCHAR,
    DataCriacao DATE,
    NotaMEC INTEGER,
    QuantSemestres INTEGER,
    MinEducacaoID INTEGER,
    AnoAltGrade INTEGER,
    TCC INTEGER,
    Creditos INTEGER,
    HorasComplementares INTEGER,
    Semestres INTEGER,
    HistoricoEM INTEGER,
    Reservista INTEGER,
    Comp_Residencia INTEGER,
    ColegioAntigo VARCHAR,
    EJA INTEGER,
    EnsinoTecnico INTEGER,
    PRIMARY KEY (AlunoID, CursoID)
);

CREATE TABLE Endereco (
    Rua VARCHAR,
    Bairro VARCHAR,
    Numero INTEGER,
    Complemento VARCHAR,
    CEP VARCHAR,
    Cidade VARCHAR,
    Estado VARCHAR
);

CREATE TABLE Doc_Finan (
    DocID INTEGER PRIMARY KEY,
    Sit_Doc INTEGER,
    Valor FLOAT,
    Emissao DATE,
    Vencimento DATE
);

CREATE TABLE Parcela (
    AnoMes_Parc DATE
);

CREATE TABLE Relacionamento_3 (
    fk_Aluno_Curso_Documentos_Origem_AlunoID INTEGER,
    fk_Aluno_Curso_Documentos_Origem_CursoID INTEGER
);

CREATE TABLE Relacionamento_6 (
    fk_Doc_Finan_DocID INTEGER
);
 
ALTER TABLE Relacionamento_3 ADD CONSTRAINT FK_Relacionamento_3_1
    FOREIGN KEY (fk_Aluno_Curso_Documentos_Origem_AlunoID, fk_Aluno_Curso_Documentos_Origem_CursoID)
    REFERENCES Aluno_Curso_Documentos_Origem (AlunoID, CursoID)
    ON DELETE SET NULL;
 
ALTER TABLE Relacionamento_6 ADD CONSTRAINT FK_Relacionamento_6_1
    FOREIGN KEY (fk_Doc_Finan_DocID)
    REFERENCES Doc_Finan (DocID)
    ON DELETE RESTRICT;