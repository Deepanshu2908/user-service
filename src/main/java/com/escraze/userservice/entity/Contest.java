package com.escraze.userservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "contest")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Contest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String gameType;
    private BigDecimal entryFee;
    private int maxParticipants;
    private BigDecimal prizePool;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}