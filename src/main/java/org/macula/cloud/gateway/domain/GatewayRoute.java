package org.macula.cloud.gateway.domain;

import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "MC_GATEWAY_ROUTE")
@Setter
@Getter
public class GatewayRoute extends org.macula.cloud.core.domain.GatewayRoute {

	private static final long serialVersionUID = 1L;

}
