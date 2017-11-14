package ru.bstu.iitus.vt41.dergilev_a;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BallType {
    String type;
    String material;
    float weight;
}
