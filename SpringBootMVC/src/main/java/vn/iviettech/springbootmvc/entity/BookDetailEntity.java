package vn.iviettech.springbootmvc.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookea_details")
public class BookDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String content;
    private Integer numberOfPage;
    private Integer price;
    private LocalDateTime publishDate;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_entity_id")
    private BookEntity bookEntity;

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(Integer numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }
}
