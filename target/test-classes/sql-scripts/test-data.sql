CREATE TABLE IF NOT EXISTS movies (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  minutes INT NOT NULL,
  genre VARCHAR(50) NOT NULL
);

insert into movies (name, minutes, genre) values
    ('Dark Knight', 152, 'ACTION'),
    ('Memento', 113, 'THRILLER'),
    ('Infinite war', 190, 'THRILLER'),
    ('Face off', 113, 'ACTION'),
    ('War machine', 125, 'ACTION'),
    ('Matrix', 136, 'ACTION');