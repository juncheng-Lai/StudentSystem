#include "dm.h"
#include "ui_dm.h"

DM::DM(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::DM)
{
    ui->setupUi(this);
}

DM::~DM()
{
    delete ui;
}
