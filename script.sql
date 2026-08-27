CREATE TABLE owners(
	id SERIAL PRIMARY key,
	id_type VARCHAR(100) NOT NULL,
	id_number VARCHAR(100) NOT NULL UNIQUE,
	full_name VARCHAR(100) NOT NULL,
	phone VARCHAR(20) NOT NULL,
	email VARCHAR(100) NOT NULL,
	address VARCHAR(100) NOT NULL,
	status BOOLEAN DEFAULT TRUE NOT NULL,
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE pets(
	id SERIAL PRIMARY key,
	name VARCHAR(100) NOT NULL,
	species VARCHAR(100) NOT NULL,
	breed VARCHAR(100) NOT NULL,
	gender VARCHAR(100) CHECK (gender in('MACHO', 'HEMBRA')),
	birth_date DATE NOT NULL,
	weight NUMERIC (5,2) CHECK  (weight > 0),
	owner_id INT NOT NULL,
	status BOOLEAN DEFAULT TRUE NOT NULL,
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,

	FOREIGN KEY (owner_id) REFERENCES owners (id),
	CONSTRAINT unique_pet_per_owner UNIQUE(owner_id, name, birth_date)
);

CREATE TABLE veterinarians(
	id SERIAL PRIMARY key,
	id_number id_number VARCHAR(100) NOT NULL UNIQUE,
	full_name VARCHAR(100) NOT NULL,
	professional_license VARCHAR(100) NOT NULL UNIQUE,
	specialty VARCHAR(100) NOT NULL,
	phone VARCHAR(100) NOT NULL,
	email VARCHAR(100) UNIQUE NOT NULL,
	status BOOLEAN DEFAULT TRUE NOT NULL
);

CREATE TABLE appointments(
	id SERIAL PRIMARY key,
	pet_id INT NOT NULL,
	veterinarian_id INT NOT NULL,
	appointment_date DATE NOT NULL,
	appointment_time TIME NOT NULL,
	reason TEXT NOT NULL,
	status  VARCHAR (20) DEFAULT 'PROGRAMADA' CHECK(status in ('PROGRAMADA', 
																'CONFIRMADA', 
																'EN_ATENCION', 
																'FINALIZADA', 
																'CANCELADA')),
	
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,	

	FOREIGN KEY (pet_id) REFERENCES pets(id),
	FOREIGN KEY (veterinarian_id) REFERENCES veterinarians(id),
	CONSTRAINT unique_vet_schedule UNIQUE(veterinarian_id, appointment_date, appointment_time),
	CONSTRAINT unique_pet_schedule UNIQUE (pet_id, appointment_date, appointment_time)
);

CREATE TABLE medicines (
    id SERIAL PRIMARY KEY,
    code VARCHAR(30) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    presentation VARCHAR(50) NOT NULL,
    laboratory VARCHAR(50),
    stock INT NOT NULL CHECK (stock >= 0),
    min_stock INT DEFAULT 5 CHECK (min_stock >= 0),
    unit_price NUMERIC(10,2) CHECK (unit_price > 0),
    status BOOLEAN DEFAULT TRUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE medical_records(
	id SERIAL PRIMARY KEY,
	appointment_id INT NOT NULL,
	pet_id INT NOT NULL,
	veterinarian_id INT NOT NULL,
	symptoms TEXT NOT NULL,
	diagnosis TEXT NOT NULL,
	treatment TEXT NOT NULL,
	observaciones TEXT,
	attention_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	status VARCHAR (20)DEFAULT 'EN_ATENCION' CHECK(status in('EN_ATENCION', 'FINALIZADA')),
	
	FOREIGN KEY (appointment_id) REFERENCES appointments (id),
	FOREIGN KEY (pet_id) REFERENCES pets (id),
	FOREIGN KEY (veterinarian_id) REFERENCES veterinarians (id)
);

