# springboot-docker

## Pasos

```
  instalar java 11, maven, intellij
  instlar docker desktop- docker runtime engine, crear cuentra en dockerhub
  crear aplicacion springboot
  importar a intellij
  crear Dockerfile
  Crear docker image
  Push docker image a docker hub repo
  Pull docker image desde docker hub repo
  Correr el pull image localmente
```

### creando imagen

```
  docker build -t appspringboot . 
```

### crear tag para docker hub

```
  docker tag appspringboot jdvpl/appspringboot
```

### correr imagen

```
 docker run -p 8090:8080 jdvpl/appspringboot:latest
```