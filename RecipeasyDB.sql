BEGIN TRANSACTION;

DROP TABLE IF EXISTS recipe_food, food, ingredient, recipe, cuisine, meal CASCADE;

CREATE TABLE recipe (
	recipe_id SERIAL,
	recipe_label varchar(300) NOT NULL,
	uri varchar(300) UNIQUE NOT NULL,
	img_url varchar(300),
	recipe_url varchar(300),
	recipe_source varchar(300),
	cuisine_id int,
	meal_id int,
	yield numeric,
	ingredient_lines varchar(1000),
	total_time int,
	instructions varchar(2000),
	CONSTRAINT PK_recipe PRIMARY KEY(recipe_id),
	CONSTRAINT FK_recipe_cuisine FOREIGN KEY(cuisine_id) REFERENCES cuisine(cuisine_id)
	CONSTRAINT FK_recipe_meal FOREIGN KEY(meal_id) REFERENCES meal(meal_id)
);

CREATE TABLE ingredient (
	ingredient_id SERIAL,
	description varchar(300),
	quantity numeric,
	measure varchar(50),
	weight numeric,
	food_id varchar(300) NOT NULL,
	recipe_id int NOT NULL,
	CONSTRAINT PK_ingredient PRIMARY KEY(ingredient_id),
	CONSTRAINT FK_ingredient_food FOREIGN KEY(food_id) REFERENCES food(food_id),
	CONSTRAINT FK_ingredient_recipe FOREIGN KEY(recipe_id) REFERENCES recipe(recipe_id)
);

CREATE TABLE food (
	food_id varchar(300) UNIQUE NOT NULL,
	food_label varchar(100) NOT NULL,
	food_category varchar(100) NOT NULL,
	CONSTRAINT PK_food PRIMARY KEY(food_id)	
);

CREATE TABLE cuisine (
	cuisine_id SERIAL,
	cuisine_label varchar(50) UNIQUE NOT NULL,
	CONSTRAINT PK_cuisine PRIMARY KEY(cuisine_id)
);

CREATE TABLE meal (
	meal_id SERIAL,
	meal_label varchar(50) UNIQUE NOT NULL,
	CONSTRAINT PK_meal PRIMARY KEY(meal_id)
);

CREATE TABLE recipe_food (
	recipe_id int NOT NULL,
	food_id varchar(300) NOT NULL,
	CONSTRAINT PK_recipe_food PRIMARY KEY(recipe_id, food_id),
	CONSTRAINT FK_recipe_food_recipe FOREIGN KEY(recipe_id) REFERENCES recipe(recipe_id),
	CONSTRAINT FK_recipe_food_food FOREIGN KEY(food_id) REFERENCES food(food_id) 
);

INSERT INTO cuisine (cuisine_label) VALUES ('american');
INSERT INTO cuisine (cuisine_label) VALUES ('asian');
INSERT INTO cuisine (cuisine_label) VALUES ('british');
INSERT INTO cuisine (cuisine_label) VALUES ('caribbean');
INSERT INTO cuisine (cuisine_label) VALUES ('central europe');
INSERT INTO cuisine (cuisine_label) VALUES ('chinese');
INSERT INTO cuisine (cuisine_label) VALUES ('eastern europe');
INSERT INTO cuisine (cuisine_label) VALUES ('french');
INSERT INTO cuisine (cuisine_label) VALUES ('greek');
INSERT INTO cuisine (cuisine_label) VALUES ('indian');
INSERT INTO cuisine (cuisine_label) VALUES ('italian');
INSERT INTO cuisine (cuisine_label) VALUES ('japanese');
INSERT INTO cuisine (cuisine_label) VALUES ('korean');
INSERT INTO cuisine (cuisine_label) VALUES ('kosher');
INSERT INTO cuisine (cuisine_label) VALUES ('mediterranean');
INSERT INTO cuisine (cuisine_label) VALUES ('mexican');
INSERT INTO cuisine (cuisine_label) VALUES ('middle eastern');
INSERT INTO cuisine (cuisine_label) VALUES ('nordic');
INSERT INTO cuisine (cuisine_label) VALUES ('south american');
INSERT INTO cuisine (cuisine_label) VALUES ('south east asian');
INSERT INTO cuisine (cuisine_label) VALUES ('world');

INSERT INTO meal (meal_label) VALUES ('breakfast');
INSERT INTO meal (meal_label) VALUES ('brunch');
INSERT INTO meal (meal_label) VALUES ('lunch/dinner');
INSERT INTO meal (meal_label) VALUES ('snack');
INSERT INTO meal (meal_label) VALUES ('teatime');


COMMIT;