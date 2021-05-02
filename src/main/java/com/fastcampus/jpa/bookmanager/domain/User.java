package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor        // 꼭 필요한 파라미터만 @NonNull이 있는 인자만
//@EqualsAndHashCode
@Data // @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@Builder
@Entity // @id pk가 꼭 셋팅되어야함!
public class User {
//    @Getter
//    @Setter
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
