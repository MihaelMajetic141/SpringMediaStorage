package com.mediastorage.repository;

import com.mediastorage.model.ImageMetadata;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImageMetadataRepository extends MongoRepository<ImageMetadata, ObjectId> {
}
