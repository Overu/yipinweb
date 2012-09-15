package com.yipin.web.bootstrap.servlet;

import com.google.inject.Inject;
import com.google.inject.Provider;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class DatabaseConnectionFilter implements Filter {

  private final Provider<HttpServletRequest> req;

  @Inject
  public DatabaseConnectionFilter(final Provider<HttpServletRequest> req) {
    this.req = req;
  }

  @Override
  public void destroy() {

  }

  @Override
  public void doFilter(final ServletRequest request, final ServletResponse response,
      final FilterChain chain) throws IOException, ServletException {
    try {
      chain.doFilter(request, response);
    } finally {
      // Connection conn =
      // (Connection) req.get().getAttribute(DatabaseConnectionProvider.CONNECTION_KEY);
      // if (conn == null) {
      // return;
      // }
      // try {
      // conn.close();
      // } catch (SQLException e) {
      // e.printStackTrace();
      // }
    }
  }

  @Override
  public void init(final FilterConfig arg0) throws ServletException {

  }

}
