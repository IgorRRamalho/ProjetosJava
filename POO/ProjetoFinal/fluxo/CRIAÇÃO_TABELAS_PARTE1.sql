CREATE TABLE IF NOT EXISTS aluno (
    aluno_id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    nome_pai VARCHAR(255),
    nome_mae VARCHAR(255),
    rg VARCHAR(20) UNIQUE,
    cpf VARCHAR(14) UNIQUE,
    data_nasc DATE,
    email VARCHAR(255),
    sexo CHAR(1),
    celular VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS materias (
    materia_id int PRIMARY KEY auto_increment,
    nome_materia VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS grade_escolar (
    aluno_id SERIAL,
    materia_id int,
    FOREIGN KEY (aluno_id) REFERENCES aluno(aluno_id),
    FOREIGN KEY (materia_id) REFERENCES materias(materia_id)
);
CREATE TABLE IF NOT EXISTS historico (
    aluno_id serial,
    materia_id INT, -- Change SERIAL to INT
    Prova1 FLOAT,
    Prova2 FLOAT,
    faltas INT,
    PRIMARY KEY (aluno_id, materia_id),
    FOREIGN KEY (aluno_id) REFERENCES aluno(aluno_id),
    FOREIGN KEY (materia_id) REFERENCES materias(materia_id)
);


CREATE TABLE IF NOT EXISTS curso (
    curso_id int PRIMARY KEY auto_increment,
    nome_curso VARCHAR(255) NOT NULL,
    turno VARCHAR(50),
    data_criacao DATE,
    nota_mec INTEGER,
    quant_semestres INTEGER,
    min_educacao_id INTEGER,
    ano_alt_grade DATE,
    tcc INT,
    creditos INTEGER,
    horas_complementares INTEGER,
    semestres INTEGER
);

CREATE TABLE IF NOT EXISTS dados_academicos (
    aluno_id SERIAL,
    curso_id int,
    PRIMARY KEY (aluno_id, curso_id),
    FOREIGN KEY (aluno_id) REFERENCES aluno(aluno_id),
    FOREIGN KEY (curso_id) REFERENCES curso(curso_id)
);

CREATE TABLE IF NOT EXISTS materias_curso (
    curso_id int,
    materia_id int,
    PRIMARY KEY (curso_id, materia_id),
    FOREIGN KEY (curso_id) REFERENCES curso(curso_id),
    FOREIGN KEY (materia_id) REFERENCES materias(materia_id)
);

CREATE TABLE IF NOT EXISTS endereco (
    aluno_id SERIAL PRIMARY KEY,
    rua VARCHAR(255),
    bairro VARCHAR(255),
    numero INTEGER,
    complemento VARCHAR(255),
    cep VARCHAR(10),
    cidade VARCHAR(255),
    estado VARCHAR(255),
    FOREIGN KEY (aluno_id) REFERENCES aluno(aluno_id)
);

CREATE TABLE IF NOT EXISTS origem (
    aluno_id SERIAL PRIMARY KEY,
    historico_em INT,
    reservista INT,
    comp_residencia INT,
    colegio_antigo VARCHAR(255),
    eja INT,
    ensino_tecnico INT,
    FOREIGN KEY (aluno_id) REFERENCES aluno(aluno_id)
);

CREATE TABLE IF NOT EXISTS doc_pagamento (
    doc_id int PRIMARY KEY auto_increment,
    sit_doc INT DEFAULT NULL,
    valor DECIMAL(10, 2) DEFAULT NULL,
    emissao DATE DEFAULT NULL,
    vencimento DATE DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS parcelas (
    parcela_id int PRIMARY KEY,
    doc_id int,
    aluno_id SERIAL,
    anomes_parc DATE DEFAULT NULL,
    semestre_parc VARCHAR(5) DEFAULT NULL,
    FOREIGN KEY (aluno_id) REFERENCES aluno(aluno_id),
    FOREIGN KEY (doc_id) REFERENCES doc_pagamento(doc_id)
);
