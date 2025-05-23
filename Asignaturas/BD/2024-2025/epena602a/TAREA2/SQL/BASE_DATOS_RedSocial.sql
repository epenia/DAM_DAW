CREATE TABLE usuarios (
    id_usuario NUMBER GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    nombre VARCHAR2(100) NOT NULL,
    email VARCHAR2(100) UNIQUE NOT NULL,
    contrasenia VARCHAR2(255) NOT NULL,
    fecha_registro DATE DEFAULT SYSDATE,
    foto_perfil VARCHAR2(255) NULL,
    CONSTRAINT usuarios_pk PRIMARY KEY(id_usuario)
);

CREATE TABLE publicaciones (
    id_publicacion NUMBER GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    id_usuario NUMBER NOT NULL,
    contenido CLOB NOT NULL,
    fecha_publicacion DATE DEFAULT SYSDATE,
    CONSTRAINT publicaciones_pk PRIMARY KEY(id_publicacion),
    CONSTRAINT usuarios_fk FOREIGN KEY(id_usuario) REFERENCES usuarios (id_usuario)
);

CREATE TABLE comentarios (
    id_comentario NUMBER GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    id_publicacion NUMBER NOT NULL,
    id_usuario NUMBER NOT NULL,
    comentario VARCHAR2(500) NOT NULL,
    fecha_comentario DATE DEFAULT SYSDATE,
    CONSTRAINT comentarios_pk PRIMARY KEY(id_comentario),
    CONSTRAINT comentarios_publicaciones_fk FOREIGN KEY(id_publicacion) REFERENCES publicaciones (id_publicacion),
    CONSTRAINT comentarios_usuarios_fk FOREIGN KEY(id_usuario) REFERENCES usuarios (id_usuario)
);

CREATE TABLE amigos (
    id_usuario1 NUMBER NOT NULL,
    id_usuario2 NUMBER NOT NULL,
    fecha_amistad DATE DEFAULT SYSDATE,
    CONSTRAINT amigos_pk PRIMARY KEY(id_usuario1, id_usuario2),
    CONSTRAINT amigos_usuario1_fk FOREIGN KEY(id_usuario1) REFERENCES usuarios (id_usuario),
    CONSTRAINT amigos_usuario2_fk FOREIGN KEY(id_usuario2) REFERENCES usuarios (id_usuario)
);

CREATE TABLE reacciones (
    id_reaccion NUMBER GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    id_usuario NUMBER NOT NULL,
    id_publicacion NUMBER NOT NULL,
    tipo_reaccion VARCHAR2(50) NOT NULL,
    fecha_reaccion DATE DEFAULT SYSDATE,
    CONSTRAINT reacciones_pk PRIMARY KEY(id_reaccion),
    CONSTRAINT reacciones_publicaciones_fk FOREIGN KEY(id_publicacion) REFERENCES publicaciones (id_publicacion),
    CONSTRAINT reacciones_usuarios_fk FOREIGN KEY(id_usuario) REFERENCES usuarios (id_usuario)
);