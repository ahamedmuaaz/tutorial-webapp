package com.tutorial.web.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.tutorial.web.data.Tutorial;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("TutorialService")
@Transactional
public class TutorialService {
    static String db_name = "tutorials", db_collection = "tutorial";
    private static Logger log = Logger.getLogger(TutorialService.class);

    public List getAll() {
        List tute_list = new ArrayList();
        DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

        // Fetching cursor object for iterating on the database records.
        DBCursor cursor = coll.find();
        while(cursor.hasNext()) {
            DBObject dbObject = cursor.next();

            Tutorial tute = new Tutorial();

            tute.setId(Integer.valueOf(dbObject.get("id").toString()));
            tute.setName(dbObject.get("name").toString());
            tute.setTutname(dbObject.get("tutname").toString());
            tute.setDescription(dbObject.get("description").toString());
            tute.setUrl(dbObject.get("url").toString());

            // Adding the user details to the list.
            tute_list.add(tute);
        }
        log.debug("Total records fetched from the mongo database are= " + tute_list.size());
        return tute_list;
    }
    // Fetching a single tutorial details from the mongo database.
    public Tutorial findTuteId(int id) {

        Tutorial u = new Tutorial();
        DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

        // Fetching the record object from the mongo database.
        DBObject where_query = new BasicDBObject();
        where_query.put("id", id);

        DBObject dbo = coll.findOne(where_query);
        u.setId(Integer.valueOf(dbo.get("id").toString()));
        u.setName(dbo.get("name").toString());
        u.setTutname(dbo.get("tutname").toString());
        u.setDescription(dbo.get("name").toString());
        u.setUrl(dbo.get("url").toString());


        // Return user object.
        return u;
    }

    // Update the selected usertutorial in the mongo database.
   /* public Boolean edit(Tutorial user) {
        boolean output = false;
        log.debug("Updating the existing user in the mongo database; Entered user_id is= " + user.getId());
        try {
            // Fetching the user details.
            BasicDBObject existing = (BasicDBObject) getDBObject(user.getId());

            DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

            // Create a new object and assign the updated details.
            BasicDBObject edited = new BasicDBObject();
            edited.put("id", user.getId());
            edited.put("name", user.getName());

            // Update the existing user to the mongo database.
            coll.update(existing, edited);
            output = true;
        } catch (Exception e) {
            output = false;
            log.error("An error has occurred while updating an existing user to the mongo database", e);
        }
        return output;
    }*/

}
