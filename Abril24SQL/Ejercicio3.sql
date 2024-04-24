CREATE TABLE IF NOT EXISTS Barcos (
	id_barco serial NOT NULL,
	n_matricula varchar(10) NOT NULL UNIQUE,
	n_amarre varchar(10) NOT NULL UNIQUE,
	nombre varchar(20) NOT NULL,
	cuota money,
	CONSTRAINT pk_Barcos PRIMARY KEY (id_barco)
);

CREATE TABLE IF NOT EXISTS Socio (
	id_socio serial NOT NULL,
	datos_personales varchar(200),
	id_barco int,
	CONSTRAINT pk_Socio PRIMARY KEY (id_socio),
	CONSTRAINT fk_Socio_Barco FOREIGN KEY (id_barco)
		REFERENCES Barcos (id_barco)
);



CREATE TABLE IF NOT EXISTS Salidas (
	id_salidas serial NOT NULL,
	fecha_salida date,
	hora_salida time,
	destino varchar(50),
	datos_patron varchar(200),
	id_barco int,
	CONSTRAINT pk_Salidas PRIMARY KEY (id_salidas),
	CONSTRAINT fk_Salidas_Barcos FOREIGN KEY (id_barco)
		REFERENCES Barcos (id_barco)
);