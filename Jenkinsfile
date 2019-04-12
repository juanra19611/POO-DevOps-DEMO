pipeline{
   agent any
   stages{
       stage('obtener repositorio'){
           steps{
               git"https://github.com/ikkiwar/Auditoria2018.git"
           }
       }
       stage('Pruebas de Unidad'){
           steps{
               sh"mvn test "
           }
       }
       stage('Construir'){
           steps{
                 sh"mvn clean"
           }
       }
   }
}
