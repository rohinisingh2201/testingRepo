package com.scheduler.taskreminder.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    // Email of the user to send the reminder to
    private String userEmail;

    private LocalDateTime dueTime;

    // To prevent repeated reminders
    private boolean reminded = false;

    // Getters and Setters
    // ... (Include all, or use Lombok if preferred)

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public LocalDateTime getDueTime() { return dueTime; }
    public void setDueTime(LocalDateTime dueTime) { this.dueTime = dueTime; }

    public boolean isReminded() { return reminded; }
    public void setReminded(boolean reminded) { this.reminded = reminded; }
}
