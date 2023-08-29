pipeline{
agent any
stages{
stage('Build'){
steps{
git ''
sh "./mvnw compile"
echo "Building the project with maven compile"
}}
stage('Test'){
steps{
sh "./mvnw test"
echo "Testing the project with maven test"
}
}
Stage('Package'){
steps{
sh "./mvnw package"
echo "Packaging the project with maven package"
}
}
}
}