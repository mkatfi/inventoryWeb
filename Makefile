
all: up

up:
	docker compose up --build 

up-logs:
	docker compose up --build

down:
	docker compose down

restart:
	docker compose restart

clean:
	docker compose down -v
	docker system prune -f

logs:
	docker compose logs -f

status:
	docker compose ps

pak:
	cd Client && npm install web-vitals && npm install

# Database management commands
# db-connect:
# 	docker exec -it todo-database psql -U postgres -d todoapp

# db-connect-user:
# 	docker exec -it todo-database psql -U todouser -d todoapp

# db-shell:
# 	docker exec -it todo-database bash

# db-logs:
# 	docker logs todo-database

# db-reset:
# 	docker compose down -v
# 	docker compose up --build -d

# Test endpoints
# test-api:
# 	curl -X GET http://localhost:8080/api/todos
# 	@echo "\n"
# 	curl -X POST http://localhost:8080/api/todos \
# 		-H "Content-Type: application/json" \
# 		-d '{"title":"Test Todo","description":"This is a test","priority":"HIGH"}'

# open:
# 	@echo "Opening application..."
# 	@echo "Frontend: http://localhost:3000"
# 	@echo "Backend API: http://localhost:8080/api/todos"

# .PHONY: all up up-logs down restart clean logs status pak db-connect db-connect-user db-shell db-logs db-reset test-api open