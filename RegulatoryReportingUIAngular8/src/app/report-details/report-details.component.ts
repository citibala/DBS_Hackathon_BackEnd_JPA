import { Component, OnInit, Input } from '@angular/core';

import { ReportListComponent } from '../report-list/report-list.component';
import { Report } from '../report';
import { ReportService } from '../report.service';

@Component({
  selector: 'app-report-details',
  templateUrl: './report-details.component.html',
  styleUrls: ['./report-details.component.css']
})
export class ReportDetailsComponent implements OnInit {

  @Input() report: Report;

  constructor(private reportService: ReportService, private listComponent: ReportListComponent) { }

  ngOnInit() {
  }
}
