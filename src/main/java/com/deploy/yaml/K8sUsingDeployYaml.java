package com.deploy.yaml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8sUsingDeployYaml {

	@GetMapping("/k8s")
	public String getK8s() {
		return "K8s using deployment yamle file is working successfully";
	}
}
