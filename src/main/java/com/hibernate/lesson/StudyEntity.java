package com.hibernate.lesson;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "study", schema = "ssh", catalog = "")
public class StudyEntity {
    private int id;
    private String lesson;
    private String name;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lesson")
    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyEntity that = (StudyEntity) o;
        return id == that.id &&
                Objects.equals(lesson, that.lesson) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lesson, name);
    }
}
