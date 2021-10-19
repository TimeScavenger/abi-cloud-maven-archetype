
echo 'mvn clean package -Dmaven.test.skip=true'
call mvn clean package -Dmaven.test.skip=true

echo 'docker build'
docker build . -t abi-cloud-maven-archetype:1.0

echo 'docker tag'
docker tag abi-cloud-maven-archetype:1.0  registry.cn-shanghai.aliyuncs.com/ab-inbev-apac/abi-cloud-maven-archetype:1.0

echo 'docker push'
docker push registry.cn-shanghai.aliyuncs.com/ab-inbev-apac/abi-cloud-maven-archetype:1.0

echo 'kubectl apply'
kubectl delete -f deployment-local.yaml -n dev
kubectl apply -f deployment-local.yaml -n dev

pause