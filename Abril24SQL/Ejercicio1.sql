CREATE TABLE IF NOT EXISTS Clientes (
	id_cliente serial NOT NULL,
	nombre varchar(50) NOT NULL,
	direccion varchar(50) NOT NULL,
	dni varchar(10) NOT NULL UNIQUE,
	CONSTRAINT pk_Clientes PRIMARY KEY (id_cliente)
);

CREATE TABLE IF NOT EXISTS Asuntos (
	id_asunto serial NOT NULL,
	fecha_inicio date,
	fecha_fin date,
	id_cliente int,
	CONSTRAINT pk_Asuntos PRIMARY KEY (id_asunto),
	CONSTRAINT fk_Asuntos_Clientes FOREIGN KEY (id_cliente)
		REFERENCES Clientes (id_cliente)
);

CREATE TABLE IF NOT EXISTS Procuradores (
	id_procurador serial NOT NULL,
	nombre varchar(50) NOT NULL,
	direccion varchar(50),
	dni varchar(10) NOT NULL UNIQUE,
	CONSTRAINT pk_Procuradores PRIMARY KEY (id_procurador)
);

CREATE TABLE IF NOT EXISTS Asuntos_Procuradores(
	id_asunto int NOT NULL,
	id_procurador int NOT NULL,
	CONSTRAINT pk_Asuntos_Procuradores PRIMARY KEY (id_asunto,id_procurador),
	CONSTRAINT fk_Asuntos_Procuradores_Asuntos FOREIGN KEY (id_asunto)
		REFERENCES Asuntos (id_asunto),
	CONSTRAINT fk_Asuntos_Procuradores_Procuradores FOREIGN KEY (id_procurador)
		REFERENCES Procuradores (id_procurador)
)