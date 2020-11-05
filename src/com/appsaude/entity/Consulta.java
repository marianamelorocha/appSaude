package com.appsaude.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Consulta {

  private LocalDateTime agendamento;
  private BigDecimal precoConsulta;
  private Paciente paciente;
  private PlanoDeSaude planoDeSaude;
  private Profissional profissional;
  private List<Exame> lsExames;

  public Consulta() {
  }

  /** Construtor da classe consulta
   * @param agendamento
   * @param precoConsulta
   * @param paciente
   * @param planoDeSaude
   * @param profissional
   * @param lsExames
   */
  public Consulta(LocalDateTime agendamento, BigDecimal precoConsulta,
      Paciente paciente, PlanoDeSaude planoDeSaude, Profissional profissional,
      List<Exame> lsExames) {
    this.agendamento = agendamento;
    this.precoConsulta = precoConsulta;
    this.paciente = paciente;
    this.planoDeSaude = planoDeSaude;
    this.profissional = profissional;
    this.lsExames = lsExames;
  }

  /**
   * método para agendar uma consulta
   */
  public void agendarConsulta() {
  }

  /**
   * método para confirmar uma consulta
   */
  public void confirmarConsulta() {
  }

  /**
   *método para remarcar uma consulta
   */
  public void remarcarConsulta() {
  }

  /**
   * método para consultar um agendamento
   */
  public void consultarAgendamento() {
  }

  public LocalDateTime getAgendamento() {
    return agendamento;
  }

  public void setAgendamento(LocalDateTime agendamento) {
    this.agendamento = agendamento;
  }

  public BigDecimal getPrecoConsulta() {
    return precoConsulta;
  }

  public void setPrecoConsulta(BigDecimal precoConsulta) {
    this.precoConsulta = precoConsulta;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public PlanoDeSaude getPlanoDeSaude() {
    return planoDeSaude;
  }

  public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
    this.planoDeSaude = planoDeSaude;
  }

  public Profissional getProfissional() {
    return profissional;
  }

  public void setProfissional(Profissional profissional) {
    this.profissional = profissional;
  }

  public List<Exame> getLsExames() {
    return lsExames;
  }

  public void setLsExames(List<Exame> lsExames) {
    this.lsExames = lsExames;
  }
}
