USE master
GO

CREATE DATABASE Db_ConsultaEmpadronamiento
ON PRIMARY
(
 NAME = 'Db_ConsultaEmpadronamiento_Data'
,FILENAME = 'C:\Data\Db_ConsultaEmpadronamiento_Data.mdf'
,SIZE = 100MB
,MAXSIZE = 1GB
,FILEGROWTH = 10MB
)

LOG ON 
(
 NAME = 'Db_ConsultaEmpadronamiento_Log'
,FILENAME = 'C:\Logs\Db_ConsultaEmpadronamiento_Log.ldf'
,SIZE = 100MB
,MAXSIZE = 1GB
,FILEGROWTH = 10MB
)

CREATE TABLE dbo.tb_departamentos(
    departamento_codigo         INT             IDENTITY(1,1),
    departamento_nombre         NVARCHAR(25)    NOT NULL,
    CONSTRAINT Pk_departamentos PRIMARY KEY (departamento_codigo)
) ON [PRIMARY]
GO

CREATE TABLE dbo.tb_municipios(
    municipio_codigo       INT              IDENTITY(1,1),
    municipio_nombre       NVARCHAR(25)     NOT NULL,
    departamento_codigo    INT              NULL,
    CONSTRAINT Pk_municipios                        PRIMARY KEY (municipio_codigo), 
    CONSTRAINT Fk_municipios_departamento_codigo    FOREIGN KEY (departamento_codigo)
    REFERENCES tb_departamentos(departamento_codigo)
) ON [PRIMARY]
GO

CREATE TABLE dbo.tb_direcciones(
    direccion_codigo      INT         IDENTITY(1,1),
    direccion_longitud    FLOAT       NOT NULL,
    direccion_latitud     FLOAT       NOT NULL,
    direccion_zona        SMALLINT    NULL,
    direccion_calle       SMALLINT    NULL,
    direccion_avenida     SMALLINT    NULL,
    direccion_casa        SMALLINT    NULL,
    municipio_codigo      INT         NULL,
    CONSTRAINT Pk_direcciones                   PRIMARY KEY (direccion_codigo), 
    CONSTRAINT Fk_direcciones_municipio_codigo  FOREIGN KEY (municipio_codigo)
    REFERENCES tb_municipios(municipio_codigo)
) ON [PRIMARY]
GO

CREATE TABLE dbo.tb_centrosDeVotacion(
    centroDeVotacion_codigo    INT             IDENTITY(1,1),
    centroDeVotacion_nombre    NVARCHAR(25)    NOT NULL,
    direccion_codigo           INT             NULL,
    CONSTRAINT Pk_centrosDeVotacion                     PRIMARY KEY (centroDeVotacion_codigo), 
    CONSTRAINT Fk_centrosDeVotacion_direccion_codigo    FOREIGN KEY (direccion_codigo)
    REFERENCES tb_direcciones(direccion_codigo)
) ON [PRIMARY]
GO

CREATE TABLE dbo.tb_mesas(
    mesa_codigo                INT    IDENTITY(1,1),
    centroDeVotacion_codigo    INT    NULL,
    CONSTRAINT Pk_mesas                         PRIMARY KEY (mesa_codigo), 
    CONSTRAINT Fk_mesas_centroDeVotacion_codigo FOREIGN KEY (centroDeVotacion_codigo)
    REFERENCES tb_centrosDeVotacion(centroDeVotacion_codigo)
) ON [PRIMARY]
GO

CREATE TABLE dbo.tb_libros(
    libro_codigo    INT    IDENTITY(1,1),
    mesa_codigo     INT    NULL,
    CONSTRAINT Pk_libros                PRIMARY KEY (libro_codigo), 
    CONSTRAINT Fk_libros_mesa_codigo    FOREIGN KEY (mesa_codigo)
    REFERENCES tb_mesas(mesa_codigo)
) ON [PRIMARY]
GO

CREATE TABLE dbo.tb_hojas(
    hoja_codigo     INT    IDENTITY(1,1),
    libro_codigo    INT    NULL,
    CONSTRAINT Pk_hojas                 PRIMARY KEY (hoja_codigo), 
    CONSTRAINT Fk_hojas_libro_codigo    FOREIGN KEY (libro_codigo)
    REFERENCES tb_libros(libro_codigo)
) ON [PRIMARY]
GO

CREATE TABLE dbo.tb_personas(
    persona_codigo               INT             IDENTITY(1,1),
    persona_dpi                  NVARCHAR(13)    NOT NULL,
    persona_padron               INT             NOT NULL,
    persona_nombre1              NVARCHAR(25)    NOT NULL,
    persona_nombre2              NVARCHAR(25)    NULL,
    persona_apellido1            NVARCHAR(25)    NOT NULL,
    persona_apellido2            NVARCHAR(25)    NULL,
    persona_foto                 NVARCHAR(25)    NULL,
    persona_firma                NVARCHAR(25)    NOT NULL,
    persona_fechaDeNacimiento    date            NOT NULL,
    direccion_codigo             INT             NULL,
    linea_codigo                 INT             NULL,
    CONSTRAINT Pk_personas                  PRIMARY KEY (persona_codigo), 
    CONSTRAINT Fk_personas_direccion_codigo FOREIGN KEY (direccion_codigo)
    REFERENCES tb_direcciones(direccion_codigo)
) ON [PRIMARY]
GO

CREATE TABLE dbo.tb_lineas(
    linea_codigo    INT    IDENTITY(1,1),
    hoja_codigo     INT    NULL,
    persona_codigo  INT    NULL,
    CONSTRAINT Pk_lineas                PRIMARY KEY (linea_codigo), 
    CONSTRAINT Fk_lineas_hoja_codigo    FOREIGN KEY (hoja_codigo)
    REFERENCES tb_hojas(hoja_codigo),
    CONSTRAINT Fk_lineas_persona_codigo FOREIGN KEY (persona_codigo)
    REFERENCES tb_personas(persona_codigo)
) ON [PRIMARY]
GO
