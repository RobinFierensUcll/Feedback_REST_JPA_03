package be.ucll.feedback.repository;

import be.ucll.feedback.model.TopicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // need to tell Spring this is a repository
public interface TopicInfoRepository extends JpaRepository<TopicInfo, Integer> {
    //public TopicInfo findByTopicInfoIdAndCreationDate(String topicId, String date);

    //public TopicInfo findByTopicInfoId(String topicId);
}
