CREATE TABLE "Genre"(
    "id" BIGINT NOT NULL,
    "Title" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "Genre" ADD PRIMARY KEY("id");
CREATE INDEX "genre_title_index" ON
    "Genre"("Title");
CREATE TABLE "Book"(
    "id" BIGINT NOT NULL,
    "Author" BIGINT NOT NULL,
    "Year_of_publication" DATE NOT NULL,
    "Genre" BIGINT NOT NULL,
    "Age_limit" INTEGER NOT NULL
);
ALTER TABLE
    "Book" ADD PRIMARY KEY("id");
CREATE INDEX "book_author_index" ON
    "Book"("Author");
CREATE INDEX "book_genre_index" ON
    "Book"("Genre");
CREATE INDEX "book_age_limit_index" ON
    "Book"("Age_limit");
CREATE TABLE "User"(
    "id" BIGINT NOT NULL,
    "Name" VARCHAR(255) NOT NULL,
    "Surname" VARCHAR(255) NOT NULL,
    "Date_of_birth" DATE NOT NULL,
    "Password" VARCHAR(255) NOT NULL,
    "Email" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "User" ADD PRIMARY KEY("id");
CREATE INDEX "user_date_of_birth_index" ON
    "User"("Date_of_birth");
CREATE INDEX "user_email_index" ON
    "User"("Email");
CREATE TABLE "Author"(
    "id" BIGINT NOT NULL,
    "Name" VARCHAR(255) NOT NULL,
    "Surnamebigint" VARCHAR(255) NOT NULL,
    "Patronymic" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "Author" ADD PRIMARY KEY("id");
CREATE INDEX "author_patronymic_index" ON
    "Author"("Patronymic");
CREATE TABLE "Orders"(
    "id" BIGINT NOT NULL,
    "Book" BIGINT NOT NULL,
    "User" BIGINT NOT NULL,
    "Order_date" DATE NOT NULL,
    "Date_return" DATE NOT NULL
);
ALTER TABLE
    "Orders" ADD PRIMARY KEY("id");
CREATE INDEX "orders_book_index" ON
    "Orders"("Book");
CREATE INDEX "orders_order_date_index" ON
    "Orders"("Order_date");
CREATE INDEX "orders_date_return_index" ON
    "Orders"("Date_return");
ALTER TABLE
    "Orders" ADD CONSTRAINT "orders_user_foreign" FOREIGN KEY("User") REFERENCES "User"("id");
ALTER TABLE
    "Book" ADD CONSTRAINT "book_author_foreign" FOREIGN KEY("Author") REFERENCES "Author"("id");
ALTER TABLE
    "Orders" ADD CONSTRAINT "orders_book_foreign" FOREIGN KEY("Book") REFERENCES "Book"("id");
ALTER TABLE
    "Book" ADD CONSTRAINT "book_genre_foreign" FOREIGN KEY("Genre") REFERENCES "Genre"("id");
