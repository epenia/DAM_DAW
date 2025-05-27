![Comandos GitHub](https://somospnt.com/images/blog/cover/205-git-comandos-basicos.jpg)

# 🚀 Comandos Esenciales de Git y GitHub

¡Bienvenido/a a esta guía rápida de comandos de Git y GitHub! Aquí encontrarás los comandos más utilizados para el control de versiones y colaboración en proyectos.

## 🔧 Configuración Inicial

```bash
# Configurar nombre de usuario (global)
git config --global user.name "Tu Nombre"

# Configurar email (global)
git config --global user.email "tu@email.com"

# Ver configuración
git config --list

```
## Comandos básicos

```bash
# Inicializar un repositorio Git
git init

# Clonar un repositorio existente
git clone https://github.com/usuario/repositorio.git

# Ver estado de los archivos
git status

# Añadir todos los archivos modificados al staging area
git add .

# Añadir un archivo específico
git add archivo.ext

# Hacer commit con mensaje
git commit -m "Mensaje descriptivo del cambio"

# Ver historial de commits
git log

```

## Trabajo con Ramas (Branches)

```bash
# Listar ramas locales
git branch

# Crear nueva rama
git branch nombre-rama

# Cambiar a una rama
git checkout nombre-rama

# Crear y cambiar a nueva rama
git checkout -b nombre-rama

# Fusionar rama actual con otra rama
git merge nombre-rama

# Eliminar rama local
git branch -d nombre-rama
```

## Interacción con GitHub 

```bash
# Añadir repositorio remoto
git remote add origin https://github.com/usuario/repositorio.git

# Subir cambios a rama principal
git push -u origin main

# Subir una rama específica
git push origin nombre-rama

# Traer cambios del remoto
git pull origin main

# Traer cambios sin fusionar
git fetch origin
```

## Inspección y comparación

```bash
# Ver diferencias en archivos no staged
git diff

# Ver diferencias en archivos staged
git diff --staged

# Ver cambios específicos en un commit
git show commit-id
```

## Deshacer cambios

```bash
# Descartar cambios en archivo no staged
git checkout -- archivo.ext

# Quitar archivo del staging area (pero mantener cambios)
git reset archivo.ext

# Revertir un commit (crea nuevo commit deshaciendo cambios)
git revert commit-id

# Rehacer el último commit (modifica el commit anterior)
git commit --amend
```

## Trabajo con Tags

```bash
# Crear tag ligero
git tag nombre-tag

# Crear tag anotado
git tag -a nombre-tag -m "Mensaje del tag"

# Subir tags al remoto
git push --tags
```

## Documentación Adicional

[Documentación Oficial de Git](https://git-scm.com/doc)

[GitHub Guides](https://docs.github.com/es)

[Git Cheat Sheet](https://education.github.com/git-cheat-sheet-education.pdf)


## Otro relacionado

[Sintaxis MarkDown](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#headings)

