#Installing services in minikube
Make sure the docker is installed and docker desktop is also good. 
Enable Kubernetes in docker desktop.
Creating docker image
mvn clean package - create a jar file
Create a Dockerfile in root of the project directory
docker build -t employee-image -f ./Dockerfile .
You can test the image with docker run -p 8080:8080 employee-image
Localhost:8080/list to test the image is running fine and all good

### Start minikube
minikube start

### Set docker env
eval $(minikube docker-env)             # for unix shells
minikube docker-env | Invoke-Expression # for PowerShell

minikube image load employee-image (if already exists don’t worry about running this, else if you want to upload the latest run this command)

kubectl apply -f employee.yaml

kubectl expose deployment employees --type=LoadBalancer --port=8080

minikube service employees will list the URL where the service can be accessed and start the service to be accessed in those HOST IP(localhost) and PORT

Once the service is stopped, services can’t be accessed anymore
