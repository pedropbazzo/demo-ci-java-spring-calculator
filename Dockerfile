FROM azul/zulu-openjdk-alpine:11

# Add app
WORKDIR /app
COPY build/libs/calculator* /app/calculator-service.jar

# Create a group and user
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

# Grant access app user
RUN chown -R appuser:appgroup /app

# Run all next commands as user
USER appuser

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/calculator-service.jar"]
