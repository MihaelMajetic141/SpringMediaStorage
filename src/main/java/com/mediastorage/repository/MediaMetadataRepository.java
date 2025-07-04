package com.mediastorage.repository;

import com.mediastorage.model.MediaMetadata;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MediaMetadataRepository extends MongoRepository<MediaMetadata, ObjectId> {
}
