# Registry

Serviço responsavel por identificar os demais microsserviços

# Gateway

Responsavel por entrada das requisições na aplicação e direcionamento para os serviços de acordo com a url.

Ao definir `spring.cloud.gateway.discovery.locator.enabled=true` o Gateway cria as rotas com base em serviços registrados com o `DiscoveryClient`. 