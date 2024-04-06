package quandaica.com.demoforquan.domain;

import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UpSertProduct {
    private String name;
    private Double price;
    private MultipartFile file;

    private LocalDateTime createdDateTime;
    private LocalDate createdDate;
    private LocalTime createdTime;

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
