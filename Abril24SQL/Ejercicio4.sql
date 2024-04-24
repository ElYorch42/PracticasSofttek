CREATE TABLE IF NOT EXISTS Coleccion (
	id_coleccion serial NOT NULL,
	volumen int NOT NULL,
	CONSTRAINT pk_Coleccion PRIMARY KEY (id_coleccion)
);

CREATE TABLE IF NOT EXISTS Libro (
	isbn int NOT NULL,
	titulo varchar(30) NOT NULL,
	autor varchar(50) NOT NULL,
	editorial varchar(30),
	id_coleccion int,
	CONSTRAINT pk_Libro PRIMARY KEY (isbn),
	CONSTRAINT fk_Libro_Coleccion FOREIGN KEY (id_Coleccion)
		REFERENCES Coleccion (id_coleccion)
);

CREATE TABLE IF NOT EXISTS Almacen (
	id_almacen serial NOT NULL,
	fecha_apertura date NOT NULL,
	direccion varchar(100) NOT NULL,
	id_provincia int,
	CONSTRAINT pk_Almacen PRIMARY KEY (id_almacen)
);

CREATE TABLE IF NOT EXISTS Almacen_Libro (
	id_almacen serial NOT NULL,
	isbn serial NOT NULL,
	cantidad int,
	CONSTRAINT pk_Almacen_Libro PRIMARY KEY (id_almacen,isbn),
	CONSTRAINT fk_Almacen_Libro_Almacen FOREIGN KEY (id_almacen)
		REFERENCES Almacen (id_almacen),
	CONSTRAINT fk_Almacen_Libro_Libro FOREIGN KEY (isbn)
		REFERENCES Libro (isbn)
	
);

CREATE TABLE IF NOT EXISTS Provincia (
	id_provincia serial NOT NULL,
	nombre varchar(40)NOT NULL,
	p_extension int NOT NULL,
	id_almacen int,
	CONSTRAINT pk_Provincia PRIMARY KEY (id_provincia),
	CONSTRAINT fk_Provincia_Almacen FOREIGN KEY (id_almacen)
		REFERENCES Almacen (id_almacen)
);

CREATE TABLE IF NOT EXISTS Poblacion (
	id_poblacion serial NOT NULL,
	nombre varchar(40) NOT NULL,
	n_habitantes int NOT NULL,
	id_provincia int,
	CONSTRAINT pk_Poblacion PRIMARY KEY (id_poblacion),
	CONSTRAINT fk_Poblacion_Provincia FOREIGN KEY (id_provincia)
		REFERENCES Provincia (id_provincia)
);

CREATE TABLE IF NOT EXISTS Socio (
	id_socio serial NOT NULL,
	dni varchar(10) NOT NULL,
	nombre varchar(40) NOT NULL,
	telefono varchar(10) NOT NULL,
	id_poblacion int NOT NULL,
	id_socio_avalador int, 
	CONSTRAINT pk_Socio PRIMARY KEY (id_socio),
	CONSTRAINT fk_Socio_Poblacion FOREIGN KEY (id_poblacion)
		REFERENCES poblacion (id_poblacion),
	CONSTRAINT fk_Socio_Socio FOREIGN KEY (id_socio_avalador)
		REFERENCES Socio (id_socio)
);

CREATE TABLE IF NOT EXISTS Pedido (
	id_pedido serial NOT NULL,
	forma_envio varchar(100) NOT NULL,
	forma_pago varchar(20) NOT NULL,
	id_socio int NOT NULL,
	CONSTRAINT pk_Pedido PRIMARY KEY (id_pedido),
	CONSTRAINT fk_Pedido_Socio FOREIGN KEY (id_socio)
		REFERENCES Socio (id_socio)
);

CREATE TABLE IF NOT EXISTS Pedido_Detalles (
	id_pedido int NOT NULL,
	consecutivo serial NOT NULL,
	isbn int NOT NULL,
	cantidad int  NOT NULL,
	CONSTRAINT pk_Pedido_Detalles PRIMARY KEY (id_pedido,consecutivo),
	CONSTRAINT fk_Pedido_Pedido_Detalles FOREIGN KEY (id_pedido)
		REFERENCES Pedido (id_pedido),
	CONSTRAINT fk_Pedido_Pedido_Libro FOREIGN KEY (isbn)
		REFERENCES Libro (isbn),
);