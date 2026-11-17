package com.arfoods.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

	@Autowired
	ChatClient chatClient;
	
	@Autowired
	ImageModel imageModel;
	
	public String askAI(@RequestParam(name= "prompt") String prompt)
	{
		return chatClient
				.prompt()
				.user(prompt)
				.call()
				.content();
	}
	
	
	@GetMapping("image")
	public String generateImage(@RequestParam String prompt, Model model)
	{
		OpenAiImageOptions openAiImageOptions = OpenAiImageOptions.builder()
				.width(1024)
				.height(1024)
				.n(1)
				.model("gpt=image-1.5")
					.quality("high")
					.build();
		
		ImageResponse imageResponse = imageModel.call(new ImagePrompt(prompt, openAiImageOptions));
		
		String 	imageBAse64 = imageResponse.getResult().getOutput().getB64Json();
		
		// need to tell which type of image format
		String imageUrl ="data:image/png;base64,"+ imageBAse64;
		model.addAttribute("imageUrl",imageUrl);
		return "image.html";
			
	
		
	}
	
	
}
