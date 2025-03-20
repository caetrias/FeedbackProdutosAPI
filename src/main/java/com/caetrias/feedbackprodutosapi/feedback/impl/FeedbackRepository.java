package com.caetrias.feedbackprodutosapi.feedback.impl;

import com.caetrias.feedbackprodutosapi.feedback.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
