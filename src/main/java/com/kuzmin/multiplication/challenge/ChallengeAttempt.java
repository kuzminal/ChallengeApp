package com.kuzmin.multiplication.challenge;

import com.kuzmin.multiplication.user.User;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChallengeAttempt {
    private Long id;
    private User userId;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
