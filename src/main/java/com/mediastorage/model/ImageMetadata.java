package com.mediastorage.model;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("image_metadata")
public record ImageMetadata(
        @Id ObjectId id,
        String originalName,
        String storedName,
        String mimeType,
        String ownerId,
        long size,
        Instant createdAt
) {}
