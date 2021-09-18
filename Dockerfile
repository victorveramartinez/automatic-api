FROM airhacks/glassfish
COPY ./target/motorapi.war ${DEPLOYMENT_DIR}
