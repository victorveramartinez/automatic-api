# Build
mvn clean package && docker build -t motorapi/motorapi .

# RUN

docker rm -f motorapi || true && docker run -d -p 8080:8080 -p 4848:4848 --name motorapi motorapi/motorapi 