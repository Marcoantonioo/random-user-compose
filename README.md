# random-user-compose
#### Projeto que faz chamadas a api https://randomuser.me/api;

# O que foi utilizado

- Clean Architecture
- MVVM
- SOLID

# Android
- Componentes do Jetpack
- Compose
- Coroutines
- Flow
- Retrofit

# Framework DI
- Koin

# Testes uniários
- MockK

# Coverage Report
- JaCoCo

run ./gradlew testDebugUnitTest para gerar o report da cobertura de testes unitários

# CI
Criado CI para rodar os tests unitários, gerar um APK e subir no artifactory   
Para rodar, basta abrir um PR para a branch main   
## TODO   
Melhorar CI para gerar um APK apenas quando for mergeado um PR na branch de release_candidate   
Melhorar CI para rodar o ktlint check
