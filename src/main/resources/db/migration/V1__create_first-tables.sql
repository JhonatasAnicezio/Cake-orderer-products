CREATE TABLE IF NOT EXISTS products (
    id BIGSERIAL PRIMARY KEY,
    size VARCHAR(255),
    name VARCHAR(255),
    price FLOAT,
    description TEXT,
    content TEXT
)