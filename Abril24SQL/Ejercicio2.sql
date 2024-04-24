CREATE TABLE IF NOT EXISTS Zoo (
	id_zoo serial NOT NULL,
	nombre varchar(50) NOT NULL,
	ciudad varchar(50)NOT NULL,
	pais varchar(50)NOT NULL,
	tamanio float NOT NULL,
	presupuesto money NOT NULL,
	CONSTRAINT pk_Zoo PRIMARY KEY (id_zoo)
);

CREATE TABLE IF NOT EXISTS Especies (
	id_especie serial NOT NULL,
	nombre_cientifico varchar(50) NOT NULL UNIQUE,
	nombre_vulgar varchar(50) NOT NULL UNIQUE,
	familia varchar(50) NOT NULL,
	peligro_extincion boolean,
	CONSTRAINT pk_Especies PRIMARY KEY (id_especie)
);

CREATE TABLE IF NOT EXISTS Animales (
	id_animales serial NOT NULL,
	sexo varchar(10) NOT NULL,
	pais_origen varchar(50),
	fecha_nacimiento date,
	id_zoo int,
	id_especie int,
	CONSTRAINT pk_Animales PRIMARY KEY (id_animales),
	CONSTRAINT fk_Animales_Zoo FOREIGN KEY (id_zoo)
		REFERENCES Zoo (id_zoo),
	CONSTRAINT fk_Animales_Especies FOREIGN KEY (id_especie)
		REFERENCES Especies (id_especie)
);