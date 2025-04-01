package com.caetrias.feedbackprodutosapi.feedback;

import org.springframework.stereotype.Service;

@Service
public interface FeedbackService {

    public Feedback adicionarFeedback();
    public Feedback removerFeedback();

    // todo: verificar se de fato isso é um metodo para produto ou feedback
    public Double calcularMedia();

}
