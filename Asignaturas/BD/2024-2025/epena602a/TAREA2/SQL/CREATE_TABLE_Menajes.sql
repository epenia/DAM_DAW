CREATE TABLE mensajes (
    id_mensaje NUMBER GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    id_usuario_emisor NUMBER NOT NULL,
    id_usuario_receptor NUMBER NOT NULL,
    mensaje CLOB NOT NULL,
    fecha_envio DATE DEFAULT SYSDATE,
    CONSTRAINT mensajes_pk PRIMARY KEY(id_mensaje),
    CONSTRAINT receptor_usuario_fk FOREIGN KEY(id_usuario_receptor) REFERENCES usuarios (id_usuario),
    CONSTRAINT emisor_usuario_fk FOREIGN KEY(id_usuario_emisor) REFERENCES usuarios (id_usuario)
)