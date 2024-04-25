package com.search.es.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Document(indexName = "members")
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private BasicProfile basicProfile;

    protected Member() {
    }

    public Member(String name, String description) {
        this(null, new BasicProfile(name, description));
    }

    @PersistenceConstructor
    public Member(Long id, BasicProfile basicProfile) {
        this.id = id;
        this.basicProfile = basicProfile;
    }

    public String getName() {
        return basicProfile.getName();
    }

    public String getDescription() {
        return basicProfile.getDescription();
    }
}
