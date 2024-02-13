package com.example.task_1_file_reader;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitleAndAuthor(String title, String author);
}
