#include "weiz.h"
#include "ui_weiz.h"

weiz::weiz(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::weiz)
{
    ui->setupUi(this);
}

weiz::~weiz()
{
    delete ui;
}
