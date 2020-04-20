package ru.game.divvvan.items;

import lombok.*;

@NoArgsConstructor
@Data
public class Ring {
    @Setter
    private String name;
    @Setter
    @Getter
    private String type;
    private int count;
    private int price;


}


