//SaveDialoge------------------------------------------------------------

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
  final JFileChooser fc = new JFileChooser();
  int var = fc.showSaveDialog(this);
  if (var == JFileChooser.APPROVE_OPTION) {
    File file = fc.getSelectedFile();
  }
}                                          


//OpenDialoge-----------------------------------------------------------
private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
  final JFileChooser fc = new JFileChooser();
  int var = fc.showOpenDialog(this);
  if (var == JFileChooser.APPROVE_OPTION) {
    File file = fc.getSelectedFile();
  }
}     
