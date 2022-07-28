package de.neuefische.cgnjava222.mongodb;

import org.springframework.data.annotation.Id;

public record Pet(
        @Id String id,
        String name
) {
}
