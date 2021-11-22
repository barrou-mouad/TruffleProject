package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Issue;

@Repository
public interface IssueRepository extends MongoRepository<Issue, String> {}

/*
db.issues.update({description:"toto"},{description:"toto",severity:0,assignee:"madrid"});
db.students.updateOne( { _id: 3 }, [ { $set: { "test3": 98, modified: "$$NOW"} } ] )

*/